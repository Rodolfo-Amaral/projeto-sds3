import { Vendedor } from "./vendedores"

export type Vendas = {
    id: number;
    visitas: number;
    negociado: number;
    qtde: number;
    data: string;
    vendedor: Vendedor;
}

export type PaginasDeVendas = {
    content?: Vendas[];
    last: boolean,
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type SomaVenda = {
    nomeVendedor: string;
    soma: number;
}

export type SucessoVendas = {
    nomeVendedor: string;
    visitados: number;
    negociados: number;
}