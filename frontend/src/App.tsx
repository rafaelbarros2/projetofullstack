import NavBar from 'components/Navbar';
import Footer from 'components/footer';
import DataTable from 'components/DataTable';
function App() {
  return (
    <>
    <NavBar/>
    <div className="container">
      <h1 className="text-primary">Olá mundo</h1>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
