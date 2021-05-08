import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/footer";
import Navbar from "components/navbar";
import React from "react";

function Dashboard() {
    return (
        <>
            <Navbar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas </h1>
                <div className="row px-3">
                    <div className="col-sm-6"/*para usar 6 partes do grafico*/>
                        <h5 className="text-center text-secondary">
                            Taxa de Sucesso (%)
            </h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">
                            Todas as Vendas
            </h5>
                        <DonutChart />
                    </div>
                </div>
                <div className="py-3">
                    <h2 className="text-primary">
                        Todas as Vendas
          </h2>
                </div>
                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;