import unittest

from parking_lot import ParkingLot


class TestParkingLot(unittest.TestCase):

    
    def test_park_next(self):

        parking_lot = ParkingLot()

        self.assertTrue(
            parking_lot.park_next()
        )

        self.assertEqual(
            1,
            parking_lot.get_filled_spaces()
        )

        self.assertEqual(
            19,
            parking_lot.get_available_spaces()
        )


    def test_park_from_left_to_right(self):

        parking_lot = ParkingLot()

        parking_lot.park_next()
        parking_lot.park_next()
        parking_lot.park_next()

        self.assertEqual(
            1,
            parking_lot.slots[0]
        )

        self.assertEqual(
            1,
            parking_lot.slots[1]
        )

        self.assertEqual(
            1,
            parking_lot.slots[2]
        )

        self.assertEqual(
            0,
            parking_lot.slots[3]
        )


    def test_park_at(self):

        parking_lot = ParkingLot()

        self.assertTrue(
            parking_lot.park_at(10)
        )

        self.assertEqual(
            1,
            parking_lot.slots[9]
        )



    def test_cannot_park_in_occupied_slot(self):

        parking_lot = ParkingLot()

        self.assertTrue(
            parking_lot.park_at(5)
        )

        self.assertFalse(
            parking_lot.park_at(5)
        )

        self.assertEqual(
            1,
            parking_lot.get_filled_spaces()
        )


    def test_leave(self):

        parking_lot = ParkingLot()

        parking_lot.park_at(5)

        self.assertTrue(
            parking_lot.leave(5)
        )

        self.assertEqual(
            0,
            parking_lot.get_filled_spaces()
        )

        self.assertEqual(
            20,
            parking_lot.get_available_spaces()
        )


    def test_leave_empty_slot(self):

        parking_lot = ParkingLot()

        self.assertFalse(
            parking_lot.leave(5)
        )


    def test_invalid_slot(self):

        parking_lot = ParkingLot()

        self.assertFalse(
            parking_lot.park_at(0)
        )

        self.assertFalse(
            parking_lot.park_at(21)
        )

        self.assertFalse(
            parking_lot.leave(0)
        )

        self.assertFalse(
            parking_lot.leave(21)
        )


    def test_parking_lot_full(self):

        parking_lot = ParkingLot()

        for i in range(20):

            self.assertTrue(
                parking_lot.park_next()
            )

        self.assertEqual(
            20,
            parking_lot.get_filled_spaces()
        )

        self.assertEqual(
            0,
            parking_lot.get_available_spaces()
        )

        # Try to park the 21st car
        self.assertFalse(
            parking_lot.park_next()
        )


if __name__ == "__main__":
    unittest.main()
