game "MiPrimerJuego"
sprite jugador at (100, 200) image "jugador.png"
sprite enemigo at (300, 200) image "enemigo.png"
on key "right" do move jugador by (10, 0)
if collision(jugador, enemigo) then
    show "¡Colisión detectada!"
end
