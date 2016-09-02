package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by HOME on 9/1/2016.
 */
public class PetContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
//PET CONTRACT for the process of the entering the columns names.

    private PetContract() {
    }
    //DEFINING THE COLUMN NAME OF THE TABLE

    /* Inner class that defines the table contents */

//PET ENTRY implementing BaseColumns
    public class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";


    /**
     * Unique ID number for the pet (only for use in the database table).
     *
     * Type: INTEGER
     */

        public static final String COLUMN_ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "NAME";
        public static final String COLUMN_PET_BREED = "BREED";
        public static final String COLUMN_PET_WEIGHT = "WEIGHT";
        public static final String COLUMN_PET_GENDER = "GENDER";

        // DEFINING THE MALE, FEMALE AND UNKNOWN
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


    }
}
