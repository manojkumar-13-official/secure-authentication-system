import { BrowserRouter, Route, Routes } from 'react-router-dom'
import LoginPage from '../pages/LoginPage'
import RegistrationPage from '../pages/RegistrationPage'
import HomePage from '../pages/HomePage'

const ProjectRouter = () => {
  return (
    <BrowserRouter>
        <Routes>
            <Route path='/' element={<LoginPage/>}></Route>
            <Route path='/register' element={<RegistrationPage/>}></Route>
            <Route path = '/home' element={<HomePage/>}></Route>
        </Routes>
    </BrowserRouter>
  )
}

export default ProjectRouter
