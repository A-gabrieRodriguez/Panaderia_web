const Input = ({ id, label, placeholder, required, type }) => {
  return (
    <div className="mb-5">
            <label for={id} className="block mb-2 text-2xl font-extrabold text-gray-900 dark:text-amber-700">{label}</label>

            <input type={type} id={id} className="h-15 bg-white border border-gray-300 text-2xl rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-white  dark:placeholder-gray-400 dark:text-black dark:focus:ring-blue-500 dark:focus:border-blue-500" placeholder={placeholder} required={required} />
          </div>
  );
};

export default Input;
