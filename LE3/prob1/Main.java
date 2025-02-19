abstract class Bharatvanshi {
    boolean canFight;

    Bharatvanshi(boolean canFight) {
        this.canFight = canFight;
    }

    abstract void fight();
    abstract boolean isObedient();
    abstract boolean isKind();
}

class Pandav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    Pandav(boolean canFight, boolean isObedient, boolean isKind) {
        super(canFight);
        this.isObedient = isObedient;
        this.isKind = isKind;
    }

    @Override
    void fight() {
        System.out.println("Pandav fighting");
    }

    @Override
    boolean isObedient() {
        return isObedient;
    }

    @Override
    boolean isKind() {
        return isKind;
    }
}

class Arjun extends Pandav {
    Arjun() {
        super(true, true, true);
    }
}

class Bheem extends Pandav {
    Bheem() {
        super(true, true, false);
    }
}

class Kaurav extends Bharatvanshi {
    boolean isObedient;
    boolean isKind;

    Kaurav(boolean canFight) {
        super(canFight);
        this.isObedient = false;
        this.isKind = false;
    }

    @Override
    void fight() {
        System.out.println("Kaurav fighting");
    }

    @Override
    boolean isObedient() {
        return isObedient;
    }

    @Override
    boolean isKind() {
        return isKind;
    }
}

class Duryodhan extends Kaurav {
    Duryodhan() {
        super(true);
    }
}

class Vikarn extends Kaurav {
    Vikarn() {
        super(true);
        this.isObedient = true;
        this.isKind = true;
    }
}

public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        System.out.println("Obedient: " + arjun.isObedient());
        System.out.println("Kind: " + arjun.isKind());

        System.out.println("\nBheem:");
        bheem.fight();
        System.out.println("Obedient: " + bheem.isObedient());
        System.out.println("Kind: " + bheem.isKind());

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        System.out.println("Obedient: " + duryodhan.isObedient());
        System.out.println("Kind: " + duryodhan.isKind());

        System.out.println("\nVikarn:");
        vikarn.fight();
        System.out.println("Obedient: " + vikarn.isObedient());
        System.out.println("Kind: " + vikarn.isKind());
    }
}
