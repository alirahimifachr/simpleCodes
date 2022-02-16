# draw shape by turtle package and logging
import turtle
import logging

logger = logging.getLogger()
logger.setLevel(logging.DEBUG)


def draw(length):
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))
    turtle.forward(length)
    turtle.left(90)
    logging.debug(f"len: " + str(length))


def drawR(length, counter):  # recursive
    if counter > 0:
        logging.debug(f"len:  {length}    counterRecursive:  {counter}")
        turtle.forward(length)
        turtle.left(90)
        counter -= 1
        drawR(length, counter)


def drawF(length, counter):  # for
    for i in range(counter):
        logging.debug(f"len:  {length}    counterFor:  {counter}")
        turtle.forward(length)
        turtle.left(90)


def main():
    length = 100
    counter = 4
    turtle.color("red")
    draw(length)
    turtle.color("green")
    turtle.forward(200)
    drawR(length, counter)
    turtle.color("blue")
    turtle.forward(200)
    drawF(length, counter)
    turtle.done()


logging.debug('Start of program')
if __name__ == '__main__':
    main()
logging.debug('End of program')
