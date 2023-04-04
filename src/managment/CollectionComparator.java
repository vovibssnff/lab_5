package managment;

import data.LabWork;

import java.util.Comparator;

/**
 * Кастомный компаратор для сравнения двух классов
 * @see LabWork
 * по значениям id
 */
public class CollectionComparator implements Comparator<LabWork> {
    @Override
    public int compare(LabWork labwork1, LabWork labwork2) {
        return Long.compare(labwork1.getId(), labwork2.getId());
    }
}
