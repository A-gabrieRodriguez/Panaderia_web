const Card = ({ img, title, description, price }) => {
  return (

    <div className="relative rounded-2xl">
      <img
        src={img}
        alt="Image pastries"
        className="w-full rounded-md object-cover group-hover:opacity-75 lg:aspect-auto lg:h-80"
      />

      <div
        className="
          flex justify-between
          absolute left-0 right-0 bottom-0
          bg-white/80 rounded-b-lg p-6
        "
      >
        <div>
          <h3 className="text-sm text-gray-700">
            <a href="#">
              <span aria-hidden="true" className="absolute inset-0 font-extrabold"></span>
              <p className="font-extrabold text-lg">{title}</p>
            </a>
          </h3>
        </div>
        <p className="text-base font-extrabold text-gray-900">{price}</p>
      </div>
    </div>
  );
}

export default Card;
