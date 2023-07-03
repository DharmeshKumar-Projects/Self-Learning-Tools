output "Container_Name" {
    description = " Name of the container"
    value = docker_container.nginx.name
}

output "Image_Name" {
    description = "Name of the image"
    value = docker_image.nginx.name
} 