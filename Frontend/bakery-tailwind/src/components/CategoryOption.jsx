const CategoryOptions = ({ category, image, description }) => {
    return (
        <button
            type="button"
            className="
        category-card
        relative
        flex items-center gap-5
        px-5 py-4
        text-left
        overflow-hidden
        hover:bg-gray-200
        transition-colors duration-300
        w-full
      "
        >
            {/* Icono */}
            <div
                className="
          flex-shrink-0
          w-16 h-16
          rounded-full
          flex items-center justify-center
        "
            >
                <img
                    src={image}
                    alt={category}
                    className="w-full h-full object-contain"
                />
            </div>

            {/* Texto */}
            <div>
                <h3 className="text-xl font-extrabold text-gray-800">
                    {category}
                </h3>

                <p className="mt-1 text-sm text-gray-600">
                    {description}
                </p>
            </div>
        </button>
    );
};

export default CategoryOptions;