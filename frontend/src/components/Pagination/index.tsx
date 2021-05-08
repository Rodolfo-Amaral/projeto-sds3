import { PaginasDeVendas } from "types/vendas";

type Props = {
    pagina: PaginasDeVendas;
    mudancaDePagina: Function;
}

const Pagination = ({ pagina, mudancaDePagina }: Props) => {

    return (
        <div className="row d-flex justify-content-center">
            <nav>
                <ul className="pagination">
                    <li className={`page-item ${pagina.first ? 'disabled' : ''} `}>
                        <button className="page-link" onClick={() => mudancaDePagina(pagina.number - 1)}>Anterior</button>
                    </li>
                    <li className="page-item disabled">
                        <span className="page-link">{pagina.number + 1}</span>
                    </li>
                    <li className={`page-item ${pagina.last ? 'disabled' : ''} `}>
                        <button className="page-link" onClick={() => mudancaDePagina(pagina.number + 1)}>Próxima</button>
                    </li>
                </ul>
            </nav>
        </div >
    )
}

export default Pagination;