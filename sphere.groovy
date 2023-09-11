//create a sphere
CSG sphere = new Sphere(80)// Spheres radius
				.toCSG()// convert to CSG to display
				
CSG sphereHighRes = new Sphere(120,// Spheres radius
						40,//elevation Divisions
						100)// vertical divisions
						.toCSG()// convert to CSG to display
sphere=sphere.movex(55)
return [sphere,sphereHighRes]