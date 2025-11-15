import { useState } from 'react'

import ProductCard from './ProductCard';

function App() {
   let [data,setData] = useState([{name:"Jeans", price:1000, discription: "DUrable ", inStock: true},
    {name:"T-shirt", price:400, discription: "cool comfy tshirt ", inStock: false},
    {name:"Shirt", price:400, discription: "Formal Shirt", inStock: true},
   ]);

  return (
    <>
     <ProductCard  data={data}></ProductCard>
    </>
  )
}

export default App