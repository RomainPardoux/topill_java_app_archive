package com.pillll.pillll.database.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pillll.pillll.database.converter.DateConverter;

import java.util.Date;

/**
 * Created by Pardoux Romain on 02/01/2019
 */

@Entity(foreignKeys = @ForeignKey(entity = Specialite.class, parentColumns = "id_code_cis", childColumns = "specialite_id_code_cis"),
        indices = {@Index(value = {"specialite_id_code_cis"})})
public class Presentation {

    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    @Expose
    private long id;
    @ColumnInfo(name = "code_cip7")
    @SerializedName("codeCip7")
    @Expose
    private String codeCip7;
    @ColumnInfo(name = "code_cip13")
    @SerializedName("codeCip13")
    @Expose
    private String codeCip13;
    @SerializedName("libelle")
    @Expose
    private String libelle;
    @ColumnInfo(name = "statut_administratif")
    @SerializedName("statutAdministratif")
    @Expose
    private String statutAdministratif;
    @ColumnInfo(name = "etat_commercialisation")
    @SerializedName("etatCommercialisation")
    @Expose
    private String etatCommercialisation;
    @TypeConverters({DateConverter.class})
    @ColumnInfo(name = "date_commercialisation")
    @SerializedName("dateCommercialisation")
    @Expose
    private Date dateCommercialisation;
    @ColumnInfo(name = "agrement_collectivites")
    @SerializedName("agrementCollectivites")
    @Expose
    private boolean agrementCollectivites;
    @ColumnInfo(name = "taux_remboursement")
    @SerializedName("tauxRemboursement")
    @Expose
    private int tauxRemboursement;
    @ColumnInfo(name = "prix_euros")
    @SerializedName("prixEuros")
    @Expose
    private double prixEuros;
    @ColumnInfo(name = "prix_euros_hors_honoraire")
    @SerializedName("prixEurosHorsHonoraire")
    @Expose
    private double prixEurosHorsHonoraire;
    @SerializedName("honoraire")
    @Expose
    private double honoraire;
    @ColumnInfo(name = "precision_remboursement")
    @SerializedName("precisionRemboursement")
    @Expose
    private String precisionRemboursement;
    @ColumnInfo(name = "specialite_id_code_cis")
    @SerializedName("specialiteIdCodeCis")
    @Expose
    private long specialiteIdCodeCis;

    public Presentation(long id, String codeCip7, String codeCip13, String libelle, String statutAdministratif, String etatCommercialisation, Date dateCommercialisation, boolean agrementCollectivites, int tauxRemboursement, double prixEuros, double prixEurosHorsHonoraire, double honoraire, String precisionRemboursement, long specialiteIdCodeCis) {
        this.id = id;
        this.codeCip7 = codeCip7;
        this.codeCip13 = codeCip13;
        this.libelle = libelle;
        this.statutAdministratif = statutAdministratif;
        this.etatCommercialisation = etatCommercialisation;
        this.dateCommercialisation = dateCommercialisation;
        this.agrementCollectivites = agrementCollectivites;
        this.tauxRemboursement = tauxRemboursement;
        this.prixEuros = prixEuros;
        this.prixEurosHorsHonoraire = prixEurosHorsHonoraire;
        this.honoraire = honoraire;
        this.precisionRemboursement = precisionRemboursement;
        this.specialiteIdCodeCis = specialiteIdCodeCis;
    }

    public Presentation() {
    }

    //    GETTER AND SETTER
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodeCip7() {
        return codeCip7;
    }

    public void setCodeCip7(String codeCip7) {
        this.codeCip7 = codeCip7;
    }

    public String getCodeCip13() {
        return codeCip13;
    }

    public void setCodeCip13(String codeCip13) {
        this.codeCip13 = codeCip13;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getStatutAdministratif() {
        return statutAdministratif;
    }

    public void setStatutAdministratif(String statutAdministratif) {
        this.statutAdministratif = statutAdministratif;
    }

    public String getEtatCommercialisation() {
        return etatCommercialisation;
    }

    public void setEtatCommercialisation(String etatCommercialisation) {
        this.etatCommercialisation = etatCommercialisation;
    }

    public Date getDateCommercialisation() {
        return dateCommercialisation;
    }

    public void setDateCommercialisation(Date dateCommercialisation) {
        this.dateCommercialisation = dateCommercialisation;
    }

    public void setAgrementCollectivites(boolean agrementCollectivites) {
        this.agrementCollectivites = agrementCollectivites;
    }

    public int getTauxRemboursement() {
        return tauxRemboursement;
    }

    public void setTauxRemboursement(int tauxRemboursement) {
        this.tauxRemboursement = tauxRemboursement;
    }

    public double getPrixEuros() {
        return prixEuros;
    }

    public void setPrixEuros(double prixEuros) {
        this.prixEuros = prixEuros;
    }

    public String getPrecisionRemboursement() {
        return precisionRemboursement;
    }

    public void setPrecisionRemboursement(String precisionRemboursement) {
        this.precisionRemboursement = precisionRemboursement;
    }

    public long getSpecialiteIdCodeCis() {
        return specialiteIdCodeCis;
    }

    public void setSpecialiteIdCodeCis(long specialiteIdCodeCis) {
        this.specialiteIdCodeCis = specialiteIdCodeCis;
    }

    public boolean isAgrementCollectivites() {
        return agrementCollectivites;
    }

    public double getPrixEurosHorsHonoraire() {
        return prixEurosHorsHonoraire;
    }

    public double getHonoraire() {
        return honoraire;
    }

    public void setPrixEurosHorsHonoraire(double prixEurosHorsHonoraire) {
        this.prixEurosHorsHonoraire = prixEurosHorsHonoraire;
    }

    public void setHonoraire(double honoraire) {
        this.honoraire = honoraire;
    }
}