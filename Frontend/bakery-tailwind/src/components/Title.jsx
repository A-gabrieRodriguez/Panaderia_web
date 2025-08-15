const Title = ({ titulo }) => {
  return (
    <div className=" pb-15 text-center my-10 flex justify-center">
      <h1 className="text-white text-6xl font-bold  bg-amber-600 w-200 p-5 shadow-2xl">{titulo}</h1>
    </div>
  );
}

export default Title;
