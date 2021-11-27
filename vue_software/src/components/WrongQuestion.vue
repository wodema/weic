<template>
    <div>
        <el-card>
            <el-row :gutter="24">
                <el-col :span="10">
                    <!-- 搜索区域 -->
                    <!-- 搜索添加 -->
                    <el-input placeholder="请输入搜索内容" v-model="queryInf.information" clearable @clear="getQuestionList">
                        <el-button slot="append" icon="el-icon-search" @click="getQuestionList"></el-button>
                    </el-input>
                </el-col>
                <el-select v-model="queryInf.kind" placeholder="题目类型" @change="getQuestionList">
                    <el-option label="请选择" value=""></el-option>
                    <el-option v-for="item in questionsKinds" :key="item" :label="item" :value="item"></el-option>
                </el-select>
            </el-row>
            <el-table :data="questionList" border stripe>
                <!-- 索引列 -->
                <el-table-column type="index" :index="indexMethod" label="序号" width="100%"></el-table-column>
                <el-table-column label="问题" prop="question"></el-table-column>
                <el-table-column label="类型" prop="kind"></el-table-column>
            </el-table>
            <!-- 分页 size-change 每页最大变化数 current-change 当前最大变化数 layout功能组件-->
            <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                :current-page="queryInf.page"
                :page-sizes="[1, 2, 5, 10]"
                :page-size="queryInf.size"
                layout="total, sizes, prev, pager, next, jumper"
                :total="total"
            ></el-pagination>
        </el-card>
    </div>
</template>
<script>

export default{
    data(){
        return{
            queryInf:{
                //查询信息实体
                //id: window.sessionStorage.getItem("user").id,
                id:3,
                information:'',
                kind:'',
                page:1,
                size:5,
            },
            total: 0,//总记录数
            questionList:[],
            questionsKinds:[],
            kind:''
        }
    },
    created(){
        this.getQuestionList();
        this.getQuestionKinds();
    },
    methods:{
        async getQuestionList(){
            console.log(this.queryInf);
            const {data: res} = await this.$http.post("/getWrongQuestions", this.queryInf);
            this.questionList = res.questionList;
            this.total = res.number;
            console.log(res);
        },
        async getQuestionKinds(){
            const {data: res} = await this.$http.get("/getWrongQuestionsKinds/"+this.queryInf.id);
            this.questionsKinds = res.kinds;
            console.log(res);
        },
        handleSizeChange(newSize){
            this.queryInf.size = newSize;
            this.getQuestionList();
        },
        //page的触发功能
        handleCurrentChange(newPage){
            this.queryInf.page = newPage;
            this.getQuestionList();
        },
        indexMethod(index){
             return (this.queryInf.page - 1) * (this.queryInf.size) + 1 + index;
        },
    }
}
</script>
<style lang="less" scoped>
.el-card{
    box-shadow: 0 1px 1px rgba(0, 8, 10, 0.15) !important;
}
.el-table{
    margin-top: 15px;
    font-size: 15px;
    min-width: 25%;
}
</style>
