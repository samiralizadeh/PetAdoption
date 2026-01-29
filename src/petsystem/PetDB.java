package petsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PetDB {

    public static void insertPet(Pet pet) {
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement()) {

            String sql = "INSERT INTO pet(name, type, age) VALUES ('"
                    + pet.getName() + "', '"
                    + pet.getType() + "', "
                    + pet.getAge() + ")";

            st.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showPets() {
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement()) {

            ResultSet rs = st.executeQuery("SELECT * FROM pet");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("type") + " | " +
                                rs.getString("name") + " | age=" +
                                rs.getInt("age")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateAge(int id, int newAge) {
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement()) {

            st.executeUpdate(
                    "UPDATE pet SET age=" + newAge +
                            " WHERE id=" + id
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deletePet(int id) {
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement()) {

            st.executeUpdate("DELETE FROM pet WHERE id=" + id);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}