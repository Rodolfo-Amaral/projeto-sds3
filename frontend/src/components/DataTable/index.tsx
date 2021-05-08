import axios from "axios";
import { useEffect, useState } from "react";
import { PaginasDeVendas } from "types/vendas";
import { setSourceMapRange } from "typescript";
import { formatLocalDate } from "utils/formats";
import { BASE_URL } from "utils/requests";

const DataTable = () => {
    const [pagina, setarPagina] = useState<PaginasDeVendas>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/vendas`)
            .then(response => {
                setarPagina(response.data);
            });
    }, []);

    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    {pagina.content?.map(item => (
                        <tr key={item.id}>
                            <td>{formatLocalDate(item.data, "dd/MM/yyyy")}</td>
                            <td>{item.vendedor.nome}</td>
                            <td>{item.visitas}</td>
                            <td>{item.negociado}</td>
                            <td>{item.qtde.toFixed(2)}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;
