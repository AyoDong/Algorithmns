package com.sheldon.basic;

import java.lang.reflect.Method;
import java.util.*;

class ContainerMethodDifferences{
    static Set<String> methodSet(Class<?> type){
        Set<String> result = new TreeSet<>();
        for(Method m : type.getMethods()){
            result.add(m.getName());
        }
        return result;
    }

    static void interfaces(Class<?> type){
        System.out.println("Interfaces in " + type.getSimpleName());
        List<String> result = new ArrayList<>();
        for(Class<?> c : type.getInterfaces()){
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);
    static {
        object.add("clone");
    }
    static void difference(Class<?> superset, Class<?> subset){
        System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = methodSet(subset);
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
    }
}