package Easy.LevenshteinDistance;

import java.util.*;

// Класс для хранения данных в структуре HashMap
public final class Data {
    // Объявляем константную переменную тип Map
    private final Map<Character, int[]> MAP;
    private final Map<int[], Character> MAP1;

    public Map<int[], Character> getMAP1() {
        return MAP1;
    }

    // Конструктор
    public Data() {
        this.MAP = new HashMap<>(); // Инициализируем HashMap
        this.MAP1 = new HashMap<>();
    }

    // Геттер для получения всей HashMap
    public Map<Character, int[]> getMAP() {
        return MAP;
    }

    // Метод put для заполнения HashMap
    public void put(Character key, int[] value) {
        this.MAP.put(key, value);
    }

    public void put(int[] key, Character value) {
        this.MAP1.put(key, value);
    }

    public Collection<int[]> getValues() {
        return MAP.values();
    }

    public Set<int[]> keySet(){
        return MAP1.keySet();
    }

    public Character get(int[] key){
        return MAP1.get(key);
    }
}
