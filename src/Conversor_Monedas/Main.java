package Conversor_Monedas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción del Conversor",
                "Convertidor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada.equals("Conversor de Moneda")) {
            ConvertidorMoneda convertidorMoneda = new ConvertidorMoneda();

            String[] opcionesMoneda = { "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sur-coreano" };
            String opcionMonedaSeleccionada = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la moneda de conversión", "Convertidor", JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMoneda, opcionesMoneda[0]);

            String inputCantidad = JOptionPane.showInputDialog(null, "Ingresa la cantidad de moneda de tu país:");
            double cantidad = Double.parseDouble(inputCantidad);

            double resultadoMoneda = 0;

            switch (opcionMonedaSeleccionada) {
                case "Dólar":
                    resultadoMoneda = convertidorMoneda.convertirADolar(cantidad);
                    break;
                case "Euro":
                    resultadoMoneda = convertidorMoneda.convertirAEuro(cantidad);
                    break;
                case "Libra Esterlina":
                    resultadoMoneda = convertidorMoneda.convertirALibra(cantidad);
                    break;
                case "Yen Japonés":
                    resultadoMoneda = convertidorMoneda.convertirAYen(cantidad);
                    break;
                case "Won sur-coreano":
                    resultadoMoneda = convertidorMoneda.convertirAWon(cantidad);
                    break;
            }

            JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultadoMoneda);
        } else if (opcionSeleccionada.equals("Conversor de Temperatura")) {
            ConvertidorTemperatura convertidorTemperatura = new ConvertidorTemperatura();

            String[] opcionesTemperatura = { "Celsius", "Fahrenheit" };
            String opcionTemperaturaSeleccionada = (String) JOptionPane.showInputDialog(null,
                    "Seleccione la escala de temperatura", "Convertidor de Temperatura", JOptionPane.QUESTION_MESSAGE,
                    null, opcionesTemperatura, opcionesTemperatura[0]);

            String inputTemperatura = JOptionPane.showInputDialog(null, "Ingresa la temperatura:");
            double temperatura = Double.parseDouble(inputTemperatura);

            double resultadoTemperatura = 0;

            switch (opcionTemperaturaSeleccionada) {
                case "Celsius":
                    resultadoTemperatura = convertidorTemperatura.convertirACelsius(temperatura);
                    break;
                case "Fahrenheit":
                    resultadoTemperatura = convertidorTemperatura.convertirAFahrenheit(temperatura);
                    break;
            }

            JOptionPane.showMessageDialog(null, "Resultado de la conversión: " + resultadoTemperatura);
        }
    }
}