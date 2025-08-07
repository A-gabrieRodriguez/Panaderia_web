import SlideBackground from '../assets/slice_background.jpg';

const Slice = () => {
    return (
        <>

            <img src={SlideBackground} alt="Slide Background pastry"
                className='
            w-full h-250 object-cover
            mask-b-from-20% mask-b-to-80% 
            brightness-70
            '
            />

            {/* Superponer el texto alineado a la izquierda encima de la imagen */}
            <div
                className="absolute inset-0 flex flex-col items-start justify-center pointer-events-none px-8 mb-50 ml-20">
                <h1 className="text-9xl text-white font-bold">La Fuente</h1>
                <h2 className="text-5xl text-white font-semibold mt-4">
                    Bienvenido a nuestra panadería
                </h2>
            </div>
        </>

    );
}
export default Slice;