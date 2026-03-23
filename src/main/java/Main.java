public int linearSearchList(ArrayList<Item> list, int target) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getCatNum() == target)
            return list.get(i).getInventory();
    }
    return -1;
}

public int recursiveLinearSearch(Item[] a, int target, int startIndex) {
    if (startIndex == a.length)
        return -1;
    if (a[startIndex].getCatNum() == target)
        return a[startIndex].getInventory();
    else
        return recursiveLinearSearch(a, target, startIndex + 1);
}

public int binarySearchList(ArrayList<Item> list, int target) {
    int low = 0;
    int high = list.size() - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (list.get(mid).getCatNum() == target)
            return list.get(mid).getInventory();
        if (list.get(mid).getCatNum() < target)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

public int recursiveBinarySearch(Item[] a, int target, int low, int high) {
    if (low > high)
        return -1;
    int mid = (low + high) / 2;
    if (a[mid].getCatNum() == target)
        return a[mid].getInventory();
    if (target < a[mid].getCatNum())
        return recursiveBinarySearch(a, target, low, mid - 1);
    else
        return recursiveBinarySearch(a, target, mid + 1, high);
}