import React from 'react'
import { Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar.jsx';
import Slice from './components/Slice/Slice.jsx';
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
      {/* Navbar siempre visible */}
      <Navbar />

      {/* Contenido que cambia */}
      <Routes>
        <Route path="/" element={
          <>
            {/* Slice siempre visible */}
            <Slice />
            <Title text="¿ Qué nos diferencia ?" />
            <Information />
            <SpaceSquare />
            <Title text="Nos ubicamos" />
            <MapInformation />
            <Footer />
          </>
        } />
        <Route path="/nosotros" element={<Nosotros />} />
        <Route path="/productos" element={<Productos />} />
      </Routes>
    </>
  )
}

export default App
