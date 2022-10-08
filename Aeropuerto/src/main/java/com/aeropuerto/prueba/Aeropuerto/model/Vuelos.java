package com.aeropuerto.prueba.Aeropuerto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="vuelos")
public class Vuelos {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String airline;
        private String time;
        private String fromvuelo;
        private int flightNo;
        private String remarks;
        private String tovuelo;
        private String gate;
        private boolean published;

        @Column(name = "create_at")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createAt;

        private String typeVuelo;

        @PrePersist
        public void prePersist() {
                this.createAt = new Date();
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getAirline() {
                return airline;
        }

        public void setAirline(String airline) {
                this.airline = airline;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
        }

        public String getFromvuelo() {
                return fromvuelo;
        }

        public void setFromvuelo(String fromvuelo) {
                this.fromvuelo = fromvuelo;
        }

        public int getFlightNo() {
                return flightNo;
        }

        public void setFlightNo(int flightNo) {
                flightNo = flightNo;
        }

        public String getRemarks() {
                return remarks;
        }

        public void setRemarks(String remarks) {
                this.remarks = remarks;
        }

        public String getTovuelo() {
                return tovuelo;
        }

        public void setTovuelo(String tovuelo) {
                this.tovuelo = tovuelo;
        }

        public String getGate() {
                return gate;
        }

        public void setGate(String gate) {
                this.gate = gate;
        }

        public Date getCreateAt() {
                return createAt;
        }

        public void setCreateAt(Date createAt) {
                this.createAt = createAt;
        }

        public String getTypeVuelo() {
                return typeVuelo;
        }

        public void setTypeVuelo(String typeVuelo) {
                this.typeVuelo = typeVuelo;
        }

        public boolean isPublished() {
                return published;
        }

        public void setPublished(boolean published) {
                this.published = published;
        }
}
