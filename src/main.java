class Pin implements Predicate {
    String pin;
    Pin(String pin){
        this.pin = pin;
    }

    @Override
    public boolean isPin(String pin) {
        int pinOne = Integer.parseInt(pin);
        int count = (pinOne == 0) ? 1 : 0;
        while (pinOne != 0) {
            count++;
            pinOne /= 10;
        }
        if ((count == 4) || (count == 6))
            return true;
        else
            return false;
    }

    @Override
    public boolean isNumeric(String pin) {
        for (char c : pin.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    @Override
    public void answ(String pin) {
        if (isNumeric(pin)){
            if (isPin(pin))
                System.out.println("Ебать заработало");
            else System.out.println("Не, нихуя");
        }
        else System.out.println("Не, нихуя");
    }

//
//    public boolean isPin(String pin) {
//        int pinOne = Integer.parseInt(pin);
//        int count = (pinOne == 0) ? 1 : 0;
//        while (pinOne != 0) {
//            count++;
//            pinOne /= 10;
//        }
//        if ((count == 4) || (count == 6))
//            return true;
//        else
//            return false;
//    }
//    public boolean isNumeric(String pin)
//    {
//        for (char c : pin.toCharArray())
//        {
//            if (!Character.isDigit(c)) return false;
//        }
//        return true;
//    }
//    public void answ(String pin){
//        if (isNumeric(pin)){
//            if (isPin(pin))
//                System.out.println("Ебать заработало");
//            else System.out.println("Не, нихуя");
//        }
//        else System.out.println("Не, нихуя");
//    }

}
