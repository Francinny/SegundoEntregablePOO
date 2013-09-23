package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class AsignaturaPractica extends Asignatura {

	private String materialApollo;
	private String sistemaOperativo;

	public AsignaturaPractica(String mA, String sO, String nom, int num, int hD, String cC) {
		super(nom, num, hD, cC);
                this.materialApollo = mA;
                this.sistemaOperativo = sO;
	}
        
        public String getMaterialApollo() {
            return materialApollo;
        }

        public void setMaterialApollo(String materialApollo) {
            this.materialApollo = materialApollo;
        }

        public String getSistemaOperativo() {
            return sistemaOperativo;
        }

        public void setSistemaOperativo(String sistemaOperativo) {
            this.sistemaOperativo = sistemaOperativo;
        }
}
