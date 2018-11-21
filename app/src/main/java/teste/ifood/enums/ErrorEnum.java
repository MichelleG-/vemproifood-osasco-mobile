package teste.ifood.enums;

import teste.ifood.R;

public enum ErrorEnum
{
    ERROR_DEFAULT(R.string.error_default),
    ERROR_WITHOUT_CONNECTION(R.string.error_without_connection);

    private int id;

    ErrorEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
