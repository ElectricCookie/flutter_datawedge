// Autogenerated from Pigeon (v10.1.6), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.circuskitchens.flutter_datawedge.pigeon

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
  if (exception is FlutterError) {
    return listOf(
      exception.code,
      exception.message,
      exception.details
    )
  } else {
    return listOf(
      exception.javaClass.simpleName,
      exception.toString(),
      "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
    )
  }
}

/**
 * Error class for passing custom error details to Flutter via a thrown PlatformException.
 * @property code The error code.
 * @property message The error message.
 * @property details The error details. Must be a datatype supported by the api codec.
 */
class FlutterError (
  val code: String,
  override val message: String? = null,
  val details: Any? = null
) : Throwable()

/** Result types when creating a profile */
enum class CreateProfileResponseType(val raw: Int) {
  PROFILEALREADYEXISTS(0),
  PROFILENAMEEMPTY(1),
  PROFILECREATED(2);

  companion object {
    fun ofRaw(raw: Int): CreateProfileResponseType? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Mode for profile creations */
enum class ConfigMode(val raw: Int) {
  CREATEIFNOTEXISTS(0),
  OVERWRITE(1),
  UPDATE(2);

  companion object {
    fun ofRaw(raw: Int): ConfigMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Plugin to be configured */
enum class PluginName(val raw: Int) {
  BARCODE(0),
  MSR(1),
  RFID(2),
  SERIAL(3),
  VOICE(4),
  WORKFLOW(5),
  BDF(6),
  ADF(7),
  TOKENS(8),
  INTENT(9),
  KEYSTROKE(10),
  IP(11),
  DCP(12),
  EKB(13);

  companion object {
    fun ofRaw(raw: Int): PluginName? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ScannerIdentifer(val raw: Int) {
  AUTO(0),
  INTERNALIMAGER(1),
  INTERNALLASER(2),
  INTERNALCAMERA(3),
  SERIALSSI(4),
  BLUETOOTHSSI(5),
  BLUETOOTHRS6000(6),
  BLUETOOTHDS2278(7),
  BLUETOOTHDS3678(8),
  PLUGABLESSI(9),
  PLUGABLESSIRS5000(10),
  USBSSIDS3608(11),
  BLUETOOTHZEBRA(12),
  USBZEBRA(13);

  companion object {
    fun ofRaw(raw: Int): ScannerIdentifer? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class UpcSupplementalMode(val raw: Int) {
  NONE(0),
  ALWAYS(1),
  AUTO(2),
  SMART(3),
  SUPPLEMENTAL378TO379(4),
  SUPPLEMENTAL978TO979(5),
  SUPPLEMENTAL414TO419AND434TO439(6),
  SUPPLEMENTAL977(7);

  companion object {
    fun ofRaw(raw: Int): UpcSupplementalMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class UpcEanCouponReport(val raw: Int) {
  OLDMODE(0),
  NEWMODE(1),
  BOTH(2);

  companion object {
    fun ofRaw(raw: Int): UpcEanCouponReport? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class UpcEanBooklandFormat(val raw: Int) {
  ISBN10(0),
  ISBN13(1);

  companion object {
    fun ofRaw(raw: Int): UpcEanBooklandFormat? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ScanningMode(val raw: Int) {
  SINGLE(0),
  UDI(1),
  MULTIBARCODE(2),
  DOCUMENTCAPTURE(3);

  companion object {
    fun ofRaw(raw: Int): ScanningMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class InverseOcr(val raw: Int) {
  REGULAR(0),
  INVERSE(1),
  AUTO(2);

  companion object {
    fun ofRaw(raw: Int): InverseOcr? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class OcrOrientation(val raw: Int) {
  DEGREE_0(0),
  DEGREE_90(1),
  DEGREE_180(2),
  DEGREE_270(3),
  OMNIDIRECTIONAL(4);

  companion object {
    fun ofRaw(raw: Int): OcrOrientation? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class IntentDelivery(val raw: Int) {
  STARTACTIVITY(0),
  STARTSERVICE(1),
  BROADCAST(2);

  companion object {
    fun ofRaw(raw: Int): IntentDelivery? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class DpmMode(val raw: Int) {
  DISABLED(0),
  MODE1(1),
  MODE2(2);

  companion object {
    fun ofRaw(raw: Int): DpmMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class BeamWidth(val raw: Int) {
  NARROW(0),
  NORMAL(1),
  WIDE(2);

  companion object {
    fun ofRaw(raw: Int): BeamWidth? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class PowerMode(val raw: Int) {
  LOW(0),
  HIGH(1),
  ALWAYSON(2),
  OPTIMIZED(3);

  companion object {
    fun ofRaw(raw: Int): PowerMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class MpdMode(val raw: Int) {
  DISPLAY_OFF(0),
  DISPLAY_ON(1);

  companion object {
    fun ofRaw(raw: Int): MpdMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class PicklistMode(val raw: Int) {
  DISABLED(0),
  HARDWARE(1),
  SOFTWARE(2);

  companion object {
    fun ofRaw(raw: Int): PicklistMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ReaderMode(val raw: Int) {
  TRIGGERED(0),
  PRESENTATION(1);

  companion object {
    fun ofRaw(raw: Int): ReaderMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class TriggerSource(val raw: Int) {
  LEFT(0),
  RIGHT(1),
  CENTER(2),
  GUN(3),
  PROXIMITY(4),
  KEYMAPPERSCAN(5),
  KEYMAPPERL1(6),
  KEYMAPPERR1(7),
  WIREDLEFT(8),
  WIREDRIGHT(9);

  companion object {
    fun ofRaw(raw: Int): TriggerSource? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class DpmIlluminationControl(val raw: Int) {
  DIRECT(0),
  INDIRECT(1),
  CYCLE(2);

  companion object {
    fun ofRaw(raw: Int): DpmIlluminationControl? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class VolumeSliderType(val raw: Int) {
  RINGER(0),
  MUSICMEDIA(1),
  ALARMS(2),
  NOTIFICATION(3);

  companion object {
    fun ofRaw(raw: Int): VolumeSliderType? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class CodeIdType(val raw: Int) {
  NONE(0),
  AIM(1),
  SYMBOL(2);

  companion object {
    fun ofRaw(raw: Int): CodeIdType? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ViewFinderMode(val raw: Int) {
  ENABLED(0),
  STATICRETICLE(1);

  companion object {
    fun ofRaw(raw: Int): ViewFinderMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class Charset(val raw: Int) {
  AUTO(0),
  UTF8(1),
  ISO88591(2),
  SHIFTJIS(3),
  GB18030(4),
  NONE(5);

  companion object {
    fun ofRaw(raw: Int): Charset? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class EffortLevel(val raw: Int) {
  LEVEL_0(0),
  LEVEL_1(1),
  LEVEL_2(2),
  LEVEL_3(3);

  companion object {
    fun ofRaw(raw: Int): EffortLevel? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class Inverse1dMode(val raw: Int) {
  DISABLE(0),
  ENABLE(1),
  AUTO(2);

  companion object {
    fun ofRaw(raw: Int): Inverse1dMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class DelayToLowPowerMode(val raw: Int) {
  SECONDS_1(0),
  SECONDS_30(1),
  MINUTES_1(2),
  MINUTES_5(3);

  companion object {
    fun ofRaw(raw: Int): DelayToLowPowerMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class LcdMode(val raw: Int) {
  DISABLED(0),
  ENABLED(1);

  companion object {
    fun ofRaw(raw: Int): LcdMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class IlluminationMode(val raw: Int) {
  OFF(0),
  TORCH(1);

  companion object {
    fun ofRaw(raw: Int): IlluminationMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class SceneDetectQualifier(val raw: Int) {
  NONE(0),
  PROXIMITYSENSOR(1);

  companion object {
    fun ofRaw(raw: Int): SceneDetectQualifier? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class AimType(val raw: Int) {
  TRIGGER(0),
  TIMEDHOLD(1),
  TIMEDRELEASE(2),
  PRESSANDRELEASE(3),
  PRESENTATION(4),
  CONTINOUSREAD(5),
  PRESSANDSUSTAIN(6),
  PRESSANDCONTINUE(7),
  TIMEDCONTINOUS(8);

  companion object {
    fun ofRaw(raw: Int): AimType? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class SwitchOnEvent(val raw: Int) {
  DISABLED(0),
  ONCONNECT(1),
  ONDISCONNECT(2),
  CONNECTORDISCONNECT(3);

  companion object {
    fun ofRaw(raw: Int): SwitchOnEvent? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class PresentationModeSensitivity(val raw: Int) {
  HIGH(0),
  MEDIUM(1),
  LOW(2);

  companion object {
    fun ofRaw(raw: Int): PresentationModeSensitivity? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class LabelType(val raw: Int) {
  CODE39(0),
  CODABAR(1),
  CODE128(2),
  D2OF5(3),
  IATA2OF5(4),
  I2OF5(5),
  CODE93(6),
  UPCA(7),
  UPCE0(8),
  UPCE1(9),
  EAN8(10),
  EAN13(11),
  MSI(12),
  EAN128(13),
  TRIOPTIC39(14),
  BOOKLAND(15),
  COUPON(16),
  DATABARCOUPON(17),
  ISBT128(18),
  CODE32(19),
  PDF417(20),
  MICROPDF(21),
  TLC39(22),
  CODE11(23),
  MAXICODE(24),
  DATAMATRIX(25),
  QRCODE(26),
  GS1DATABAR(27),
  GS1DATABARLIM(28),
  GS1DATABAREXP(29),
  USPOSTNET(30),
  USPLANET(31),
  UKPOSTAL(32),
  JAPPOSTAL(33),
  AUSPOSTAL(34),
  DUTCHPOSTAL(35),
  FINNISHPOSTAL4S(36),
  CANPOSTAL(37),
  CHINESE2OF5(38),
  AZTEC(39),
  MICROQR(40),
  US4STATE(41),
  US4STATEFICS(42),
  COMPOSITEAB(43),
  COMPOSITEC(44),
  WEBCODE(45),
  SIGNATURE(46),
  KOREAN3OF5(47),
  MATRIX2OF5(48),
  OCR(49),
  HANXIN(50),
  MAILMARK(51),
  FORMAT(52),
  GS1DATAMATRIX(53),
  GS1QRCODE(54),
  DOTCODE(55),
  GRIDMATRIX(56),
  UNDEFINED(57);

  companion object {
    fun ofRaw(raw: Int): LabelType? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ScanSource(val raw: Int) {
  MSR(0),
  SCANNER(1),
  SIMULSCAN(2),
  SERIAL(3),
  VOICE(4),
  RFID(5);

  companion object {
    fun ofRaw(raw: Int): ScanSource? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class DecodeMode(val raw: Int) {
  MULTIPLE(0),
  SINGLE(1);

  companion object {
    fun ofRaw(raw: Int): DecodeMode? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

enum class ScannerState(val raw: Int) {
  WAITING(0),
  SCANNING(1),
  IDLE(2),
  CONNECTED(3),
  DISCONNECTED(4),
  DISABLED(5);

  companion object {
    fun ofRaw(raw: Int): ScannerState? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/**
 * Result when creating a profile
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class CreateProfileResponse (
  val responseType: CreateProfileResponseType

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): CreateProfileResponse {
      val responseType = CreateProfileResponseType.ofRaw(list[0] as Int)!!
      return CreateProfileResponse(responseType)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      responseType.raw,
    )
  }
}

/**
 * An application that will trigger the profile
 *
 * Generated class from Pigeon that represents data sent in messages.
 */
data class AppEntry (
  val packageName: String,
  val activityList: List<String?>

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): AppEntry {
      val packageName = list[0] as String
      val activityList = list[1] as List<String?>
      return AppEntry(packageName, activityList)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      packageName,
      activityList,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PluginIntentParamters (
  val intentOutputEnabled: Boolean? = null,
  val intentAction: String? = null,
  val intentCategory: String? = null,
  val intentDelivery: IntentDelivery? = null,
  val intentUseContentProvider: Boolean? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): PluginIntentParamters {
      val intentOutputEnabled = list[0] as Boolean?
      val intentAction = list[1] as String?
      val intentCategory = list[2] as String?
      val intentDelivery: IntentDelivery? = (list[3] as Int?)?.let {
        IntentDelivery.ofRaw(it)
      }
      val intentUseContentProvider = list[4] as Boolean?
      return PluginIntentParamters(intentOutputEnabled, intentAction, intentCategory, intentDelivery, intentUseContentProvider)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      intentOutputEnabled,
      intentAction,
      intentCategory,
      intentDelivery?.raw,
      intentUseContentProvider,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PluginBarcodeParamters (
  val dataBarToUpcEan: Boolean? = null,
  val upcEnableMarginlessDecode: Boolean? = null,
  val upcEanSecurityLevel: Long? = null,
  val upcEanSupplemental2: Boolean? = null,
  val upcEanSupplemental5: Boolean? = null,
  val upcEanSupplementalMode: UpcSupplementalMode? = null,
  val upcEanRetryCount: Long? = null,
  val upcEeanLinearDecode: Boolean? = null,
  val upcEanBookland: Boolean? = null,
  val upcEanCoupon: Boolean? = null,
  val upcEanCouponReport: UpcEanCouponReport? = null,
  val upcEanZeroExtend: Boolean? = null,
  val upceanBooklandFormat: UpcEanBooklandFormat? = null,
  val scanningMode: ScanningMode? = null,
  val docCaptureTemplate: String? = null,
  val commonBarcodeDynamicQuantity: Long? = null,
  val barcodeHighlightingEnabled: Boolean? = null,
  val ruleName: String? = null,
  val enableUdiGs1: Boolean? = null,
  val enableUdiHibcc: Boolean? = null,
  val enableUdiIccbba: Boolean? = null,
  val ocrOrientation: OcrOrientation? = null,
  val ocrLines: Long? = null,
  val ocrMinChars: Long? = null,
  val ocrMaxChars: Long? = null,
  val ocrSubset: String? = null,
  val ocrQuietZone: Long? = null,
  val ocrTemplate: String? = null,
  val ocrCheckDigitModulus: Long? = null,
  val ocrCheckDigitMultiplier: Long? = null,
  val ocrCheckDigitValidation: Long? = null,
  val inverseOcr: InverseOcr? = null,
  val presentationModeSensitivity: PresentationModeSensitivity? = null,
  val enableHardwareTrigger: Boolean? = null,
  val autoSwitchToDefaultOnEvent: SwitchOnEvent? = null,
  val digimarcDecoding: Boolean? = null,
  val multiBarcodeCount: Long? = null,
  val enableInstantReporting: Boolean? = null,
  val reportDecodedBarcodes: Boolean? = null,
  val scannerTriggerResource: TriggerSource? = null,
  val scannerInputEnabled: Boolean? = null,
  val scannerSelection: ScannerIdentifer? = null,
  val configureAllScanners: Boolean? = null,
  val scannerSelectionByIdentifier: String? = null,
  val enableAimMode: Boolean? = null,
  val beamTimer: Long? = null,
  val enableAdaptiveScanning: Boolean? = null,
  val beamWidth: BeamWidth? = null,
  val powerMode: PowerMode? = null,
  val mpdMode: MpdMode? = null,
  val readerMode: ReaderMode? = null,
  val linearSecurityLevel: Long? = null,
  val picklist: PicklistMode? = null,
  val aimType: AimType? = null,
  val sceneDetectQualifier: SceneDetectQualifier? = null,
  val aimTimer: Long? = null,
  val sameBarcodeTimeout: Long? = null,
  val triggerWakeupScan: Boolean? = null,
  val differentBarcodeTimeout: Long? = null,
  val illuminationMode: IlluminationMode? = null,
  val illuminationBrightness: Long? = null,
  val lcdMode: LcdMode? = null,
  val lowPowerTimeout: Long? = null,
  val delayToLowPowerMode: DelayToLowPowerMode? = null,
  val inverse1dMode: Inverse1dMode? = null,
  val viewFinderSize: Long? = null,
  val viewFinderPosX: Long? = null,
  val viewFinderPosY: Long? = null,
  val marginlessEffortLevel1d: EffortLevel? = null,
  val poorQualityBcDecodeEffortLevel: EffortLevel? = null,
  val charsetName: Charset? = null,
  val autoCharsetPrefferedOrder: List<String?>? = null,
  val autoCharsetFallback: Charset? = null,
  val viewFinderMode: ViewFinderMode? = null,
  val codeIdType: CodeIdType? = null,
  val volumeSliderType: VolumeSliderType? = null,
  val decodeAudioFeedbackUri: String? = null,
  val decodeHapticFeedback: Boolean? = null,
  val btDisconnectOnExit: Boolean? = null,
  val connectionIdleTime: Long? = null,
  val establishConnectionTime: Long? = null,
  val remoteScannerAudioFeedbackMode: Long? = null,
  val remoteScannerLedFeedbackMode: Long? = null,
  val displayBtAddressBarcode: Boolean? = null,
  val goodDecodeLedTimer: Long? = null,
  val decodingLedFeedback: Boolean? = null,
  val decoderUsPlanetReportCheckDigit: Boolean? = null,
  val decodeScreenNotification: Boolean? = null,
  val decodeScreenTime: Long? = null,
  val decodeScreenTranslucency: Long? = null,
  val keepParingInfoAfterReboot: Boolean? = null,
  val dpmIlluminationControl: DpmIlluminationControl? = null,
  val dpmMode: DpmMode? = null,
  val qrLaunchEnable: Boolean? = null,
  val qrLaunchEnableQrDecoder: Boolean? = null,
  val qrLaunchShowConfirmationDialog: Boolean? = null,
  val noDecodeTime: Long? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): PluginBarcodeParamters {
      val dataBarToUpcEan = list[0] as Boolean?
      val upcEnableMarginlessDecode = list[1] as Boolean?
      val upcEanSecurityLevel = list[2].let { if (it is Int) it.toLong() else it as Long? }
      val upcEanSupplemental2 = list[3] as Boolean?
      val upcEanSupplemental5 = list[4] as Boolean?
      val upcEanSupplementalMode: UpcSupplementalMode? = (list[5] as Int?)?.let {
        UpcSupplementalMode.ofRaw(it)
      }
      val upcEanRetryCount = list[6].let { if (it is Int) it.toLong() else it as Long? }
      val upcEeanLinearDecode = list[7] as Boolean?
      val upcEanBookland = list[8] as Boolean?
      val upcEanCoupon = list[9] as Boolean?
      val upcEanCouponReport: UpcEanCouponReport? = (list[10] as Int?)?.let {
        UpcEanCouponReport.ofRaw(it)
      }
      val upcEanZeroExtend = list[11] as Boolean?
      val upceanBooklandFormat: UpcEanBooklandFormat? = (list[12] as Int?)?.let {
        UpcEanBooklandFormat.ofRaw(it)
      }
      val scanningMode: ScanningMode? = (list[13] as Int?)?.let {
        ScanningMode.ofRaw(it)
      }
      val docCaptureTemplate = list[14] as String?
      val commonBarcodeDynamicQuantity = list[15].let { if (it is Int) it.toLong() else it as Long? }
      val barcodeHighlightingEnabled = list[16] as Boolean?
      val ruleName = list[17] as String?
      val enableUdiGs1 = list[18] as Boolean?
      val enableUdiHibcc = list[19] as Boolean?
      val enableUdiIccbba = list[20] as Boolean?
      val ocrOrientation: OcrOrientation? = (list[21] as Int?)?.let {
        OcrOrientation.ofRaw(it)
      }
      val ocrLines = list[22].let { if (it is Int) it.toLong() else it as Long? }
      val ocrMinChars = list[23].let { if (it is Int) it.toLong() else it as Long? }
      val ocrMaxChars = list[24].let { if (it is Int) it.toLong() else it as Long? }
      val ocrSubset = list[25] as String?
      val ocrQuietZone = list[26].let { if (it is Int) it.toLong() else it as Long? }
      val ocrTemplate = list[27] as String?
      val ocrCheckDigitModulus = list[28].let { if (it is Int) it.toLong() else it as Long? }
      val ocrCheckDigitMultiplier = list[29].let { if (it is Int) it.toLong() else it as Long? }
      val ocrCheckDigitValidation = list[30].let { if (it is Int) it.toLong() else it as Long? }
      val inverseOcr: InverseOcr? = (list[31] as Int?)?.let {
        InverseOcr.ofRaw(it)
      }
      val presentationModeSensitivity: PresentationModeSensitivity? = (list[32] as Int?)?.let {
        PresentationModeSensitivity.ofRaw(it)
      }
      val enableHardwareTrigger = list[33] as Boolean?
      val autoSwitchToDefaultOnEvent: SwitchOnEvent? = (list[34] as Int?)?.let {
        SwitchOnEvent.ofRaw(it)
      }
      val digimarcDecoding = list[35] as Boolean?
      val multiBarcodeCount = list[36].let { if (it is Int) it.toLong() else it as Long? }
      val enableInstantReporting = list[37] as Boolean?
      val reportDecodedBarcodes = list[38] as Boolean?
      val scannerTriggerResource: TriggerSource? = (list[39] as Int?)?.let {
        TriggerSource.ofRaw(it)
      }
      val scannerInputEnabled = list[40] as Boolean?
      val scannerSelection: ScannerIdentifer? = (list[41] as Int?)?.let {
        ScannerIdentifer.ofRaw(it)
      }
      val configureAllScanners = list[42] as Boolean?
      val scannerSelectionByIdentifier = list[43] as String?
      val enableAimMode = list[44] as Boolean?
      val beamTimer = list[45].let { if (it is Int) it.toLong() else it as Long? }
      val enableAdaptiveScanning = list[46] as Boolean?
      val beamWidth: BeamWidth? = (list[47] as Int?)?.let {
        BeamWidth.ofRaw(it)
      }
      val powerMode: PowerMode? = (list[48] as Int?)?.let {
        PowerMode.ofRaw(it)
      }
      val mpdMode: MpdMode? = (list[49] as Int?)?.let {
        MpdMode.ofRaw(it)
      }
      val readerMode: ReaderMode? = (list[50] as Int?)?.let {
        ReaderMode.ofRaw(it)
      }
      val linearSecurityLevel = list[51].let { if (it is Int) it.toLong() else it as Long? }
      val picklist: PicklistMode? = (list[52] as Int?)?.let {
        PicklistMode.ofRaw(it)
      }
      val aimType: AimType? = (list[53] as Int?)?.let {
        AimType.ofRaw(it)
      }
      val sceneDetectQualifier: SceneDetectQualifier? = (list[54] as Int?)?.let {
        SceneDetectQualifier.ofRaw(it)
      }
      val aimTimer = list[55].let { if (it is Int) it.toLong() else it as Long? }
      val sameBarcodeTimeout = list[56].let { if (it is Int) it.toLong() else it as Long? }
      val triggerWakeupScan = list[57] as Boolean?
      val differentBarcodeTimeout = list[58].let { if (it is Int) it.toLong() else it as Long? }
      val illuminationMode: IlluminationMode? = (list[59] as Int?)?.let {
        IlluminationMode.ofRaw(it)
      }
      val illuminationBrightness = list[60].let { if (it is Int) it.toLong() else it as Long? }
      val lcdMode: LcdMode? = (list[61] as Int?)?.let {
        LcdMode.ofRaw(it)
      }
      val lowPowerTimeout = list[62].let { if (it is Int) it.toLong() else it as Long? }
      val delayToLowPowerMode: DelayToLowPowerMode? = (list[63] as Int?)?.let {
        DelayToLowPowerMode.ofRaw(it)
      }
      val inverse1dMode: Inverse1dMode? = (list[64] as Int?)?.let {
        Inverse1dMode.ofRaw(it)
      }
      val viewFinderSize = list[65].let { if (it is Int) it.toLong() else it as Long? }
      val viewFinderPosX = list[66].let { if (it is Int) it.toLong() else it as Long? }
      val viewFinderPosY = list[67].let { if (it is Int) it.toLong() else it as Long? }
      val marginlessEffortLevel1d: EffortLevel? = (list[68] as Int?)?.let {
        EffortLevel.ofRaw(it)
      }
      val poorQualityBcDecodeEffortLevel: EffortLevel? = (list[69] as Int?)?.let {
        EffortLevel.ofRaw(it)
      }
      val charsetName: Charset? = (list[70] as Int?)?.let {
        Charset.ofRaw(it)
      }
      val autoCharsetPrefferedOrder = list[71] as List<String?>?
      val autoCharsetFallback: Charset? = (list[72] as Int?)?.let {
        Charset.ofRaw(it)
      }
      val viewFinderMode: ViewFinderMode? = (list[73] as Int?)?.let {
        ViewFinderMode.ofRaw(it)
      }
      val codeIdType: CodeIdType? = (list[74] as Int?)?.let {
        CodeIdType.ofRaw(it)
      }
      val volumeSliderType: VolumeSliderType? = (list[75] as Int?)?.let {
        VolumeSliderType.ofRaw(it)
      }
      val decodeAudioFeedbackUri = list[76] as String?
      val decodeHapticFeedback = list[77] as Boolean?
      val btDisconnectOnExit = list[78] as Boolean?
      val connectionIdleTime = list[79].let { if (it is Int) it.toLong() else it as Long? }
      val establishConnectionTime = list[80].let { if (it is Int) it.toLong() else it as Long? }
      val remoteScannerAudioFeedbackMode = list[81].let { if (it is Int) it.toLong() else it as Long? }
      val remoteScannerLedFeedbackMode = list[82].let { if (it is Int) it.toLong() else it as Long? }
      val displayBtAddressBarcode = list[83] as Boolean?
      val goodDecodeLedTimer = list[84].let { if (it is Int) it.toLong() else it as Long? }
      val decodingLedFeedback = list[85] as Boolean?
      val decoderUsPlanetReportCheckDigit = list[86] as Boolean?
      val decodeScreenNotification = list[87] as Boolean?
      val decodeScreenTime = list[88].let { if (it is Int) it.toLong() else it as Long? }
      val decodeScreenTranslucency = list[89].let { if (it is Int) it.toLong() else it as Long? }
      val keepParingInfoAfterReboot = list[90] as Boolean?
      val dpmIlluminationControl: DpmIlluminationControl? = (list[91] as Int?)?.let {
        DpmIlluminationControl.ofRaw(it)
      }
      val dpmMode: DpmMode? = (list[92] as Int?)?.let {
        DpmMode.ofRaw(it)
      }
      val qrLaunchEnable = list[93] as Boolean?
      val qrLaunchEnableQrDecoder = list[94] as Boolean?
      val qrLaunchShowConfirmationDialog = list[95] as Boolean?
      val noDecodeTime = list[96].let { if (it is Int) it.toLong() else it as Long? }
      return PluginBarcodeParamters(dataBarToUpcEan, upcEnableMarginlessDecode, upcEanSecurityLevel, upcEanSupplemental2, upcEanSupplemental5, upcEanSupplementalMode, upcEanRetryCount, upcEeanLinearDecode, upcEanBookland, upcEanCoupon, upcEanCouponReport, upcEanZeroExtend, upceanBooklandFormat, scanningMode, docCaptureTemplate, commonBarcodeDynamicQuantity, barcodeHighlightingEnabled, ruleName, enableUdiGs1, enableUdiHibcc, enableUdiIccbba, ocrOrientation, ocrLines, ocrMinChars, ocrMaxChars, ocrSubset, ocrQuietZone, ocrTemplate, ocrCheckDigitModulus, ocrCheckDigitMultiplier, ocrCheckDigitValidation, inverseOcr, presentationModeSensitivity, enableHardwareTrigger, autoSwitchToDefaultOnEvent, digimarcDecoding, multiBarcodeCount, enableInstantReporting, reportDecodedBarcodes, scannerTriggerResource, scannerInputEnabled, scannerSelection, configureAllScanners, scannerSelectionByIdentifier, enableAimMode, beamTimer, enableAdaptiveScanning, beamWidth, powerMode, mpdMode, readerMode, linearSecurityLevel, picklist, aimType, sceneDetectQualifier, aimTimer, sameBarcodeTimeout, triggerWakeupScan, differentBarcodeTimeout, illuminationMode, illuminationBrightness, lcdMode, lowPowerTimeout, delayToLowPowerMode, inverse1dMode, viewFinderSize, viewFinderPosX, viewFinderPosY, marginlessEffortLevel1d, poorQualityBcDecodeEffortLevel, charsetName, autoCharsetPrefferedOrder, autoCharsetFallback, viewFinderMode, codeIdType, volumeSliderType, decodeAudioFeedbackUri, decodeHapticFeedback, btDisconnectOnExit, connectionIdleTime, establishConnectionTime, remoteScannerAudioFeedbackMode, remoteScannerLedFeedbackMode, displayBtAddressBarcode, goodDecodeLedTimer, decodingLedFeedback, decoderUsPlanetReportCheckDigit, decodeScreenNotification, decodeScreenTime, decodeScreenTranslucency, keepParingInfoAfterReboot, dpmIlluminationControl, dpmMode, qrLaunchEnable, qrLaunchEnableQrDecoder, qrLaunchShowConfirmationDialog, noDecodeTime)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      dataBarToUpcEan,
      upcEnableMarginlessDecode,
      upcEanSecurityLevel,
      upcEanSupplemental2,
      upcEanSupplemental5,
      upcEanSupplementalMode?.raw,
      upcEanRetryCount,
      upcEeanLinearDecode,
      upcEanBookland,
      upcEanCoupon,
      upcEanCouponReport?.raw,
      upcEanZeroExtend,
      upceanBooklandFormat?.raw,
      scanningMode?.raw,
      docCaptureTemplate,
      commonBarcodeDynamicQuantity,
      barcodeHighlightingEnabled,
      ruleName,
      enableUdiGs1,
      enableUdiHibcc,
      enableUdiIccbba,
      ocrOrientation?.raw,
      ocrLines,
      ocrMinChars,
      ocrMaxChars,
      ocrSubset,
      ocrQuietZone,
      ocrTemplate,
      ocrCheckDigitModulus,
      ocrCheckDigitMultiplier,
      ocrCheckDigitValidation,
      inverseOcr?.raw,
      presentationModeSensitivity?.raw,
      enableHardwareTrigger,
      autoSwitchToDefaultOnEvent?.raw,
      digimarcDecoding,
      multiBarcodeCount,
      enableInstantReporting,
      reportDecodedBarcodes,
      scannerTriggerResource?.raw,
      scannerInputEnabled,
      scannerSelection?.raw,
      configureAllScanners,
      scannerSelectionByIdentifier,
      enableAimMode,
      beamTimer,
      enableAdaptiveScanning,
      beamWidth?.raw,
      powerMode?.raw,
      mpdMode?.raw,
      readerMode?.raw,
      linearSecurityLevel,
      picklist?.raw,
      aimType?.raw,
      sceneDetectQualifier?.raw,
      aimTimer,
      sameBarcodeTimeout,
      triggerWakeupScan,
      differentBarcodeTimeout,
      illuminationMode?.raw,
      illuminationBrightness,
      lcdMode?.raw,
      lowPowerTimeout,
      delayToLowPowerMode?.raw,
      inverse1dMode?.raw,
      viewFinderSize,
      viewFinderPosX,
      viewFinderPosY,
      marginlessEffortLevel1d?.raw,
      poorQualityBcDecodeEffortLevel?.raw,
      charsetName?.raw,
      autoCharsetPrefferedOrder,
      autoCharsetFallback?.raw,
      viewFinderMode?.raw,
      codeIdType?.raw,
      volumeSliderType?.raw,
      decodeAudioFeedbackUri,
      decodeHapticFeedback,
      btDisconnectOnExit,
      connectionIdleTime,
      establishConnectionTime,
      remoteScannerAudioFeedbackMode,
      remoteScannerLedFeedbackMode,
      displayBtAddressBarcode,
      goodDecodeLedTimer,
      decodingLedFeedback,
      decoderUsPlanetReportCheckDigit,
      decodeScreenNotification,
      decodeScreenTime,
      decodeScreenTranslucency,
      keepParingInfoAfterReboot,
      dpmIlluminationControl?.raw,
      dpmMode?.raw,
      qrLaunchEnable,
      qrLaunchEnableQrDecoder,
      qrLaunchShowConfirmationDialog,
      noDecodeTime,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class ProfileConfig (
  val profileName: String,
  val configMode: ConfigMode,
  val barcodeParamters: PluginBarcodeParamters? = null,
  val intentParamters: PluginIntentParamters? = null,
  val profileEnabled: Boolean,
  val appList: List<AppEntry?>? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): ProfileConfig {
      val profileName = list[0] as String
      val configMode = ConfigMode.ofRaw(list[1] as Int)!!
      val barcodeParamters: PluginBarcodeParamters? = (list[2] as List<Any?>?)?.let {
        PluginBarcodeParamters.fromList(it)
      }
      val intentParamters: PluginIntentParamters? = (list[3] as List<Any?>?)?.let {
        PluginIntentParamters.fromList(it)
      }
      val profileEnabled = list[4] as Boolean
      val appList = list[5] as List<AppEntry?>?
      return ProfileConfig(profileName, configMode, barcodeParamters, intentParamters, profileEnabled, appList)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      profileName,
      configMode.raw,
      barcodeParamters?.toList(),
      intentParamters?.toList(),
      profileEnabled,
      appList,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class ScanEvent (
  val labelType: LabelType,
  val source: ScanSource,
  val dataString: String,
  val decodeData: List<ByteArray?>,
  val decodeMode: DecodeMode

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): ScanEvent {
      val labelType = LabelType.ofRaw(list[0] as Int)!!
      val source = ScanSource.ofRaw(list[1] as Int)!!
      val dataString = list[2] as String
      val decodeData = list[3] as List<ByteArray?>
      val decodeMode = DecodeMode.ofRaw(list[4] as Int)!!
      return ScanEvent(labelType, source, dataString, decodeData, decodeMode)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      labelType.raw,
      source.raw,
      dataString,
      decodeData,
      decodeMode.raw,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class StatusChangeEvent (
  val newState: ScannerState

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): StatusChangeEvent {
      val newState = ScannerState.ofRaw(list[0] as Int)!!
      return StatusChangeEvent(newState)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      newState.raw,
    )
  }
}

@Suppress("UNCHECKED_CAST")
private object DataWedgeFlutterApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          ScanEvent.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          StatusChangeEvent.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is ScanEvent -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is StatusChangeEvent -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated class from Pigeon that represents Flutter messages that can be called from Kotlin. */
@Suppress("UNCHECKED_CAST")
class DataWedgeFlutterApi(private val binaryMessenger: BinaryMessenger) {
  companion object {
    /** The codec used by DataWedgeFlutterApi. */
    val codec: MessageCodec<Any?> by lazy {
      DataWedgeFlutterApiCodec
    }
  }
  fun onScannerStatusChanged(statusEventArg: StatusChangeEvent, callback: () -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeFlutterApi.onScannerStatusChanged", codec)
    channel.send(listOf(statusEventArg)) {
      callback()
    }
  }
  fun onScanResult(scanEventArg: ScanEvent, callback: () -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeFlutterApi.onScanResult", codec)
    channel.send(listOf(scanEventArg)) {
      callback()
    }
  }
  fun onProfileChange(callback: () -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeFlutterApi.onProfileChange", codec)
    channel.send(null) {
      callback()
    }
  }
  fun onConfigUpdate(callback: () -> Unit) {
    val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeFlutterApi.onConfigUpdate", codec)
    channel.send(null) {
      callback()
    }
  }
}
@Suppress("UNCHECKED_CAST")
private object DataWedgeHostApiCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          AppEntry.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CreateProfileResponse.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PluginBarcodeParamters.fromList(it)
        }
      }
      131.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PluginIntentParamters.fromList(it)
        }
      }
      132.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          ProfileConfig.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?)   {
    when (value) {
      is AppEntry -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is CreateProfileResponse -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is PluginBarcodeParamters -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      is PluginIntentParamters -> {
        stream.write(131)
        writeValue(stream, value.toList())
      }
      is ProfileConfig -> {
        stream.write(132)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface DataWedgeHostApi {
  fun createProfile(profileName: String, callback: (Result<CreateProfileResponse>) -> Unit)
  fun getPackageIdentifer(): String
  fun setProfileConfig(config: ProfileConfig, callback: (Result<Unit>) -> Unit)

  companion object {
    /** The codec used by DataWedgeHostApi. */
    val codec: MessageCodec<Any?> by lazy {
      DataWedgeHostApiCodec
    }
    /** Sets up an instance of `DataWedgeHostApi` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: DataWedgeHostApi?) {
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeHostApi.createProfile", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val profileNameArg = args[0] as String
            api.createProfile(profileNameArg) { result: Result<CreateProfileResponse> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeHostApi.getPackageIdentifer", codec)
        if (api != null) {
          channel.setMessageHandler { _, reply ->
            var wrapped: List<Any?>
            try {
              wrapped = listOf<Any?>(api.getPackageIdentifer())
            } catch (exception: Throwable) {
              wrapped = wrapError(exception)
            }
            reply.reply(wrapped)
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.flutter_datawedge.DataWedgeHostApi.setProfileConfig", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val configArg = args[0] as ProfileConfig
            api.setProfileConfig(configArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}
