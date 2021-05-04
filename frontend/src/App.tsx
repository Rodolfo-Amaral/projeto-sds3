import DataTable from "components/DataTable";
import Footer from "components/footer";
import Navbar from "components/navbar";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">
          <DataTable />
        </h1>
      </div>
      <Footer />
    </>
  );
}

export default App;
