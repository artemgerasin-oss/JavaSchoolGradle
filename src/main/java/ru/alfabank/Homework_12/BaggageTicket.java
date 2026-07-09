package ru.alfabank.Homework_12;

public class BaggageTicket {


        private final String passengerName;
        private final String flightNumber;
        private final int weightBaggage;


        BaggageTicket(String passengerName, String flightNumber, int weightBaggage) {
            this.passengerName = passengerName;
            this.flightNumber = flightNumber;
            this.weightBaggage = weightBaggage;
        }


        public int getWeightBaggage() {
            return weightBaggage;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public String getPassengerName() {
            return passengerName;
        }

        @Override
        public String toString() {

            return "BaggageTicket \n" +
                    "passengerName = " + passengerName + "\n" +
                    "flightNumber = " + flightNumber + "\n" +
                    "weightBaggage = " + weightBaggage + "\n";
        }


    }

