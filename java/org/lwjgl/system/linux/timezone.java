/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Timezone structure */
public final class timezone implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TZ_MINUTESWEST,
		TZ_DSTTIME;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		TZ_MINUTESWEST = offsets.get(0);
		TZ_DSTTIME = offsets.get(1);
	}

	private final ByteBuffer struct;

	public timezone() {
		this(malloc());
	}

	public timezone(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setTzMinuteswest(int tz_minuteswest) { tz_minuteswest(struct, tz_minuteswest); }
	public void setTzDsttime(int tz_dsttime) { tz_dsttime(struct, tz_dsttime); }

	public int getTzMinuteswest() { return tz_minuteswest(struct); }
	public int getTzDsttime() { return tz_dsttime(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int tz_minuteswest,
		int tz_dsttime
	) {
		ByteBuffer timezone = malloc();

		tz_minuteswest(timezone, tz_minuteswest);
		tz_dsttime(timezone, tz_dsttime);

		return timezone;
	}

	public static void tz_minuteswest(ByteBuffer timezone, int tz_minuteswest) { timezone.putInt(timezone.position() + TZ_MINUTESWEST, tz_minuteswest); }
	public static void tz_dsttime(ByteBuffer timezone, int tz_dsttime) { timezone.putInt(timezone.position() + TZ_DSTTIME, tz_dsttime); }

	public static int tz_minuteswest(ByteBuffer timezone) { return timezone.getInt(timezone.position() + TZ_MINUTESWEST); }
	public static int tz_dsttime(ByteBuffer timezone) { return timezone.getInt(timezone.position() + TZ_DSTTIME); }

}