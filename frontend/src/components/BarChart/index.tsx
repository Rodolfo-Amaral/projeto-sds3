import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SucessoVendas } from 'types/vendas';
import { round } from 'utils/formats';
import { BASE_URL } from 'utils/requests';
type SeriesData = {
    name: string;
    data: number[];
}
type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
}

const BarChart = () => {

    const [ChartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });
    useEffect(() => {
        axios.get(`${BASE_URL}/vendas/sucesso-por-vendedor`)
            .then(response => {
                const data = response.data as SucessoVendas[];
                const myLabels = data.map(x => x.nomeVendedor);
                const mySeries = data.map(x => round(100.0 * x.negociados / x.visitados, 1));

                setChartData({
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "Taxa de Conversão",
                            data: mySeries
                        }
                    ]
                });
            });
    }, []);
    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    return (
        <Chart
            options={{ ...options, xaxis: ChartData.labels }}
            series={ChartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;
