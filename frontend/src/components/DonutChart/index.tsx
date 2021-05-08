import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SomaVenda } from 'types/vendas';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    const [ChartData, setChartData] = useState<ChartData>({ labels: [], series: [] });

    useEffect(() => {
        axios.get(`${BASE_URL}/vendas/soma-por-vendedor`)
            .then(response => {
                const data = response.data as SomaVenda[];
                const myLabels = data.map(x => x.nomeVendedor);
                const mySeries = data.map(x => x.soma);

                setChartData({ labels: myLabels, series: mySeries });
                console.log(ChartData);
            });
    });

    const options = {
        legend: {
            show: true
        }
    }
    return (
        <Chart
            options={{ ...options, labels: ChartData.labels }}
            series={ChartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;
