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
        private Date time;
        private String fromvuelo;
        private int FlightNo;
        private String remarks;
        private String tovuelo;
        private Double gate;

        @Column(name = "create_at")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createAt;

        private char typeVuelo;

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

        public Date getTime() {
                return time;
        }

        public void setTime(Date time) {
                this.time = time;
        }

        public String getFromvuelo() {
                return fromvuelo;
        }

        public void setFromvuelo(String fromvuelo) {
                this.fromvuelo = fromvuelo;
        }

        public int getFlightNo() {
                return FlightNo;
        }

        public void setFlightNo(int flightNo) {
                FlightNo = flightNo;
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

        public Double getGate() {
                return gate;
        }

        public void setGate(Double gate) {
                this.gate = gate;
        }

        public Date getCreateAt() {
                return createAt;
        }

        public void setCreateAt(Date createAt) {
                this.createAt = createAt;
        }

        public char getTypeVuelo() {
                return typeVuelo;
        }

        public void setTypeVuelo(char typeVuelo) {
                this.typeVuelo = typeVuelo;
        }
}
