(ns babashka.impl.features
  {:no-doc true})

;; included by default
(def yaml? (not= "false" (System/getenv "BABASHKA_FEATURE_YAML")))
(def xml? (not= "false" (System/getenv "BABASHKA_FEATURE_XML")))

;; excluded by default
(def hsqldb? (= "true" (System/getenv "BABASHKA_FEATURE_HSQLDB")))