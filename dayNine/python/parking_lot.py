class ParkingLot:

    SIZE = 20

    def __init__(self):

        self.slots = [0] * self.SIZE

    def park_next(self):

        for index in range(self.SIZE):

            if self.slots[index] == 0:
                self.slots[index] = 1
                return True

        return False

    def park_at(self, slot_number):

        index = slot_number - 1

        if index < 0 or index >= self.SIZE:
            return False

        if self.slots[index] == 1:
            return False


        self.slots[index] = 1

        return True

    def leave(self, slot_number):

        index = slot_number - 1

    
        if index < 0 or index >= self.SIZE:
            return False

        if self.slots[index] == 0:
            return False

        self.slots[index] = 0

        return True

    def get_available_spaces(self):

        count = 0

        for slot in self.slots:

            if slot == 0:
                count += 1

        return count

    def get_filled_spaces(self):

        count = 0

        for slot in self.slots:

            if slot == 1:
                count += 1

        return count

    def display_status(self):

        print("\n----- PARKING STATUS -----")

        for index in range(self.SIZE):

            print(
                "Slot", index + 1, ":", self.slots[i]
            )

        print(
            "Available spaces:",
            self.get_available_spaces()
        )

        print(
            "Filled spaces:",
            self.get_filled_spaces()
        )

        print("--------------------------")
