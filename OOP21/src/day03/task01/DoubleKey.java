package day03.task01;

/*Пользуясь практическим заданием №2, разработайте
более абстраткный клас DoubleKey так, чтбы
он допускал в качестве ключей обьекты любого типа,
а не только типа String
Для того чтобы новый класс работал, необходимо изменить
определение методов equals() и hashCode()
*/

public class DoubleKey {
	private Object key1;
	private Object key2;

	public DoubleKey() {
		super();
		key1 = "key1";
		key2 = "key2";
	}

	public DoubleKey(Object key1, Object key2) {
		super();
		this.key1 = key1;
		this.key2 = key2;
	}

	public Object getKey1() {
		return key1;
	}

	public void setKey1(Object key1) {
		this.key1 = key1;
	}

	public Object getKey2() {
		return key2;
	}

	public void setKey2(Object key2) {
		this.key2 = key2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key1 == null) ? 0 : key1.hashCode());
		result = prime * result + ((key2 == null) ? 0 : key2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoubleKey other = (DoubleKey) obj;
		if (key1 == null) {
			if (other.key1 != null)
				return false;
		} else if (!key1.equals(other.key1))
			return false;
		if (key2 == null) {
			if (other.key2 != null)
				return false;
		} else if (!key2.equals(other.key2))
			return false;
		return true;
	}

}
