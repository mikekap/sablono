(ns sablono.test
  (:require [doo.runner :refer-macros [doo-tests]]
            [sablono.core-test]
            [sablono.interpreter-test]
            [sablono.normalize-test]
            [sablono.server-test]
            [sablono.util-test]))

;; Or doo will exit with an error, see:
;; https://github.com/bensu/doo/issues/83#issuecomment-165498172
(set! (.-error js/console) (fn [x] (.log js/console x)))

(doo-tests 'sablono.core-test
           'sablono.interpreter-test
           'sablono.normalize-test
           'sablono.server-test
           'sablono.util-test)
