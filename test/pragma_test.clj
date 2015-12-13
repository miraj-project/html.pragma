(ns pragma-test
  (:require [miraj.html.pragma :as pragma]))

(println (pragma/content-type "utf-8"))

(miraj.markup/serialize :html
 (pragma/content-type "utf-8"))

(miraj.markup/serialize :html
 (pragma/default-style "styles/default.css"))

;; <meta http-equiv="Refresh" content="300">
(miraj.markup/serialize :html
 (pragma/refresh 300))

;; <meta http-equiv="Refresh" content="20; URL=page4.html">
(miraj.markup/serialize :html
 (pragma/refresh "20; URL=page4.html"))

;; <meta http-equiv="Content-Security-Policy" content="script-src 'self'; object-src 'none'">
(miraj.markup/serialize :html
 (pragma/content-security-policy "script-src 'self'; object-src 'none'"))

;; non-conforming
(miraj.markup/serialize :html
 (pragma/content-language "en"))

(miraj.markup/serialize :html
 (pragma/set-cookie "en"))
