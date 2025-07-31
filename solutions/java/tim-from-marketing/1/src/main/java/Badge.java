class Badge {
    public String print(Integer id, String name, String department) {
        String idString = id != null ? "[" + id + "] - " : "";
        String departmentLabel = department != null ? department.toUpperCase() : "OWNER";
        return idString + name + " - " + departmentLabel;
    }
}
