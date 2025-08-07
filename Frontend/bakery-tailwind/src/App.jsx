import React from 'react'
import Navbar from './components/Navbar.jsx';
import Slice from './components/Slice.jsx';
import Information from './components/Information.jsx';
import Title from './components/Title.jsx';
import SpaceSquare from './components/SpaceSquare.jsx';
import MapInformation from './components/FormInformation/MapInformation.jsx';

const App = () => {
  return (
    <>
      <Navbar /> 
      <Slice /> 
      <Title titulo="¿ Qué nos diferencia ?" />
      <Information />
      <SpaceSquare />
      <Title titulo="Nos ubicamos" />
      <MapInformation />
    </>
  )
}

export default App
