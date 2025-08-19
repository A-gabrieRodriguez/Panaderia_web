// ImageSlice es un componente funcional de React que recibe una prop llamada 'image'.
// Renderiza una imagen usando la URL proporcionada en 'image'.
// La imagen tiene clases de Tailwind CSS para ajustar su tamaño, recorte, máscara y brillo.
// El alt describe la imagen como "Slide Background pastry".

const ImageSlice = ({ image }) => {
    return (
        
        <img src={image} alt="Slide Background pastry"
            className='
            w-full h-250 object-cover
            mask-b-from-20% mask-b-to-80% 
            brightness-70
            '
        />
    );
};

export default ImageSlice;
