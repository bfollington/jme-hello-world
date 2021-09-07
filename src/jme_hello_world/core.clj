(ns jme-hello-world.core

  (:require [jme-clj.core :as jme])
  (:import [com.jme3.math ColorRGBA])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn init []
  (let [box  (jme/box 1 1 1)
        geom (jme/geo "Box" box)
        mat  (jme/material "Common/MatDefs/Misc/Unshaded.j3md")]
    (jme/set* mat :color "Color" ColorRGBA/Blue)
    (jme/set* geom :material mat)
    (jme/add-to-root geom)))

(jme/defsimpleapp app :init init)

(jme/start app)