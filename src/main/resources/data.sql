INSERT INTO `Usuario` (`id`, `email`, `nombre`) VALUES ('1', 'user-1@domain.com', 'name user 1');
INSERT INTO `Usuario` (`id`, `email`, `nombre`) VALUES ('2', 'user-2@other-domain.com', 'name user 2');
INSERT INTO `Usuario` (`id`, `email`, `nombre`) VALUES ('3', 'user-3@some-domain.com', 'name user 3');

INSERT INTO `Publicacion` (`id`, `contenido`, `titulo`, `usuarioId`) VALUES ('1', 'some great post content', 'post 1', '1');
INSERT INTO `Publicacion` (`id`, `contenido`, `titulo`, `usuarioId`) VALUES ('2', 'the most interesting post ever', 'post 2', '1');
INSERT INTO `Publicacion` (`id`, `contenido`, `titulo`, `usuarioId`) VALUES ('3', 'awesome post 2018', 'post 3', '2');
INSERT INTO `Publicacion` (`id`, `contenido`, `titulo`, `usuarioId`) VALUES ('4', 'simple content post', 'post 4 ', '3');


INSERT INTO `Comentario` (`id`, `calificacion`, `contenido`, `publicacionId`) VALUES ('1', '5', 'excelent', '1');
INSERT INTO `Comentario` (`id`, `calificacion`, `contenido`, `publicacionId`) VALUES ('2', '4', 'very usefull', '2');
INSERT INTO `Comentario` (`id`, `calificacion`, `contenido`, `publicacionId`) VALUES ('3', '5', 'thaks for sharing', '3');
