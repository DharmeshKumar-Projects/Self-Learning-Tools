variable "container_name" {
    description = "name of a container"
    type = string
    default = "NewTutorial"
}

variable "image_name" {
    description = "Name of Docker Image"
    type = string
    default = "nginx"
}