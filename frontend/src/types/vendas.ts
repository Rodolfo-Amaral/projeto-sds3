import { type } from "node:os"

export type SomaVenda = {
    nomeVendedor: string;
    soma: number;
}

export type SucessoVendas = {
    nomeVendedor: string;
    visitados: number;
    negociados: number;
}