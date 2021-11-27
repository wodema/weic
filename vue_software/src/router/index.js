import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import WrongQuestion from '../components/WrongQuestion.vue'
import Login from '../components/Login.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'login',
    component: Login
  },
  {
    path: '/login',
    component: Login
  },
  {
    path: '/question',
    name: 'Question',
    component: WrongQuestion
  }
]

const router = new VueRouter({
  routes
})

export default router
