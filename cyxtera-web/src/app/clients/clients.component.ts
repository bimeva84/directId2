import { Component, OnInit } from '@angular/core';

import { ClientesService } from '../services/clientes.service'
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.css']
})

export class ClientsComponent implements OnInit {

  clientes;
  filtro = {
    name: '',
    phone: '',
    email: '',
    startDate: '',
    endDate: ''
  }

  json = {
    sharedKey: '',
    businessId: '',
    email: '',
    phone: '',
    startDate: '',
    endDate: ''
  }

  constructor(private clientesService: ClientesService,
    private modalService: NgbModal) { }



  // Funciona para cargar clientes
  getClientes(): void {
    this.clientesService.getClientes()
      .subscribe(clients => this.clientes = clients.respuesta != undefined ?
        clients.respuesta : []);
  }

  ngOnInit() {
    this.getClientes();
  }

  //Abrir modal para ingresar cliente
  open(contenido) {
    this.modalService.open(contenido, {})
  }

  createClient(valid) {
    console.log(valid)

    if (valid) {
      this.json.businessId = this.filtro.name;
      this.json.sharedKey = this.filtro.name;
      this.json.phone = this.filtro.phone;
      this.json.email = this.filtro.email;
      //this.json.startDate = this.filtro.startDate;
      //this.json.endDate = this.filtro.endDate;

      return this.clientesService.postClientes(this.json)
        .subscribe(
          (respuesta) => {
            console.log("se guardo exitosamente")
            console.log(respuesta)
          }
        );
    }

  }


}
