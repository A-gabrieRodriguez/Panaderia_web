import React from 'react'
import { Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar.jsx';
import Slice from './components/Slice.jsx';
import Information from './components/Information.jsx';
import Title from './components/Title.jsx';
import SpaceSquare from './components/SpaceSquare.jsx';
import MapInformation from './components/MapInformation.jsx';
import Footer from './components/Footer.jsx';
import Nosotros from './Nosotros.jsx';
import Productos from './Productos.jsx';

const App = () => {
  return (
    <>
      <Navbar /> 
      <Routes>
        <Route path="/" element={
          <>
            <Slice /> 
            <Title titulo="¿ Qué nos diferencia ?" />
            <Information />
            <SpaceSquare />
            <Title titulo="Nos ubicamos" />
            <MapInformation />
            <Footer />
          </>
        } />
        <Route path="/nosotros" element={<Nosotros />} /> {/* Agregando pestaña de Nosotros */}
        <Route path="/productos" element={<Productos />} /> {/* Agregando pestaña de Productos */}
      </Routes>
    </>
  )
}

export default App
