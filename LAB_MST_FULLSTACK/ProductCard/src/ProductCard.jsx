
export default function ProductCard({ data }) {
  return (
    <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6 p-6">
      {data.map((item, index) => (
        <div
          key={index}
          className="bg-blue  p-4 hover:bg:gray-100 transition border border-gray-200 rounded-lg "
        >
          <h1 className="text-xl font-bold  mb-2">{item.name}</h1>
          <h2 className="text-lg font-semibold text-gray-700">₹{item.price}</h2>
          <h3 className="  my-2">{item.discription}</h3>
          <h4>
            {item.inStock ? (
              <button className="mt-3 w-full bg-amber-500 text-white hover:cursor-pointer">
                Buy Now
              </button>
            ) : (
              <div className="mt-3 text-center text-red-600 font-medium">
                Out of Stock
              </div>
            )}
          </h4>
        </div>
      ))}
    </div>
  );
}